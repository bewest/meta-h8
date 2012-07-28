# ok ok, this is a direct rip off of Philip. But it looks minimal enough
# I actually think core-image-minimal would probably do fine

DESCRIPTION = "A foundational basic image without support for X that can be \
reasonably used for customization."

IMAGE_FEATURES += "apps-console-core ssh-server-openssh tools-sdk \
                   tools-debug debug-tweaks"

IMAGE_INSTALL = "\
    task-core-boot \
    task-core-basic \
    "

#    ${CORE_IMAGE_BASE_INSTALL} 

inherit core-image

