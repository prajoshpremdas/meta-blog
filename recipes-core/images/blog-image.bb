# The image is based on core-image-base found in poky/meta/recipes-core/images
require recipes-core/images/core-image-base.bb

# install ssh server
IMAGE_INSTALL += "dropbear"

