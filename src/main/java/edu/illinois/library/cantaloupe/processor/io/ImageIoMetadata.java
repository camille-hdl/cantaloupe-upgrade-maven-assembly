package edu.illinois.library.cantaloupe.processor.io;

import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataNode;

/**
 * Wraps an {@link IIOMetadata} instance for the purposes of ImageIO metadata
 * exchange.
 */
public class ImageIoMetadata {

    private String formatName;
    private IIOMetadata iioMetadata;

    public ImageIoMetadata(IIOMetadata metadata, String formatName) {
        setIioMetadata(metadata);
        setFormatName(formatName);
    }

    public IIOMetadataNode getAsTree() {
        return (IIOMetadataNode) getIioMetadata().getAsTree(getFormatName());
    }

    public String getFormatName() {
        return formatName;
    }

    public IIOMetadata getIioMetadata() {
        return iioMetadata;
    }

    public void setIioMetadata(IIOMetadata metadata) {
        iioMetadata = metadata;
    }

    public void setFormatName(String name) {
        formatName = name;
    }

}
