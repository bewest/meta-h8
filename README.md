# Overview
This is a meta-layer for use in open-embedded to build images targeted
for the h8300 series processors. We are especially interested in the
medtronics insulin pumps. See [insulaudit](https://github.com/bewest/insulaudit)

# Links
* [h8 gnu compiler](http://www.gnuh8.org/)
* [more gnu dev tools for h8](http://h8300-hms.sourceforge.net/)

# Status
I have no clue what I'm  doing. The kernel definitely needs lots of work
For one thing we *definitely* need to pass it some configure options.
There is some support in linux-yocto-2.6.37 for the h8:

`UCLINUX FOR RENESAS H8/300 (H8300)
M:	Yoshinori Sato <ysato@users.sourceforge.jp>
W:	http://uclinux-h8.sourceforge.jp/
S:	Supported
F:	arch/h8300/
F:	drivers/ide/ide-h8300.c
F:	drivers/net/ne-h8300.c
`

I don't actually know what that means though
