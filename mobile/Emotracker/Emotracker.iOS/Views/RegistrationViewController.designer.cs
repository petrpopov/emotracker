// WARNING
//
// This file has been generated automatically by Xamarin Studio to store outlets and
// actions made in the UI designer. If it is removed, they will be lost.
// Manual changes to this file may not be handled correctly.
//
using MonoTouch.Foundation;
using System.CodeDom.Compiler;

namespace Emotracker.iOS
{
	[Register ("RegistrationViewController")]
	partial class RegistrationViewController
	{
		[Outlet]
		MonoTouch.UIKit.UITextField emailField { get; set; }

		[Outlet]
		MonoTouch.UIKit.UIView messageView { get; set; }

		[Outlet]
		MonoTouch.UIKit.UITextField nameField { get; set; }

		[Outlet]
		MonoTouch.UIKit.UITextField passwordField { get; set; }

		[Outlet]
		MonoTouch.UIKit.UIButton registrationButton { get; set; }

		[Outlet]
		MonoTouch.UIKit.UILabel regMessageLabel { get; set; }

		[Outlet]
		MonoTouch.UIKit.UITextField userName { get; set; }
		
		void ReleaseDesignerOutlets ()
		{
			if (emailField != null) {
				emailField.Dispose ();
				emailField = null;
			}

			if (nameField != null) {
				nameField.Dispose ();
				nameField = null;
			}

			if (passwordField != null) {
				passwordField.Dispose ();
				passwordField = null;
			}

			if (registrationButton != null) {
				registrationButton.Dispose ();
				registrationButton = null;
			}

			if (userName != null) {
				userName.Dispose ();
				userName = null;
			}

			if (messageView != null) {
				messageView.Dispose ();
				messageView = null;
			}

			if (regMessageLabel != null) {
				regMessageLabel.Dispose ();
				regMessageLabel = null;
			}
		}
	}
}
