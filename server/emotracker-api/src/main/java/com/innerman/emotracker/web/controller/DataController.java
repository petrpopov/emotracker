package com.innerman.emotracker.web.controller;

import com.innerman.emotracker.core.dto.UserDataDTO;
import com.innerman.emotracker.core.model.DataEventEntity;
import com.innerman.emotracker.core.service.DataEntityService;
import com.innerman.emotracker.core.service.DataEventEntityService;
import com.innerman.emotracker.core.utils.EmoException;
import com.innerman.emotracker.web.data.WebMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by petrpopov on 11.03.14.
 */

@Controller("dataWebController")
@RequestMapping("/api/data")
public class DataController {

    @Autowired
    private DataEntityService dataEntityService;

    @Autowired
    private DataEventEntityService dataEventEntityService;

    @RequestMapping(value = "/saveData", method = RequestMethod.POST)
    @ResponseBody
    public Object saveData(@Valid @RequestBody UserDataDTO data, BindingResult result) {

        if( result.hasErrors() ) {
            return WebMessage.createValidationError();
        }

        try {
            dataEntityService.saveDataForUser(data);
        }
        catch (EmoException e) {
            return WebMessage.createError(e);
        }

        return WebMessage.createOK("OK");
    }

    @RequestMapping(value = "/getDataEvents.data", method = RequestMethod.GET)
    @ResponseBody
    public Object getDataEvents() {

        List<DataEventEntity> lastEvents = dataEventEntityService.getLastEvents();
        return lastEvents;
    }
}