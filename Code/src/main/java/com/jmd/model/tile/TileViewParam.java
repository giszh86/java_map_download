package com.jmd.model.tile;

import lombok.Data;

@Data
public class TileViewParam {

    private String path;
    private String pathStyle;
    private String type;

    public TileViewParam() {

    }

    public TileViewParam(String path, String pathStyle, String type) {
        this.path = path;
        this.pathStyle = pathStyle;
        this.type = type;
    }

    public boolean check() {
        return this.path != null && this.pathStyle != null && this.type != null;
    }

}
