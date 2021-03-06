package com.renny.simplebrowser.business.http.constants;


import com.renny.simplebrowser.business.http.response.parses.ParseImg;
import com.renny.simplebrowser.business.http.response.parses.ParseSearch;
import com.renny.simplebrowser.globe.http.IHttpCell;
import com.renny.simplebrowser.globe.http.parambuilder.IParamBuilder;
import com.renny.simplebrowser.globe.http.reponse.IResultParse;
import com.renny.simplebrowser.globe.http.request.IHost;

import java.util.List;

/**
 * Created by LuckyCrystal on 2017/10/25.
 */

public interface HttpCells {

    IHttpCell Img = new IHttpCell() {
        @Override
        public IHost getHost() {
            return Hosts.defaults;
        }

        @Override
        public String getUA() {
            return UAs.defaultUa;
        }

        @Override
        public IResultParse getResultParse() {
            return new ParseImg();
        }

        @Override
        public IParamBuilder getParamBuilder() {
            return ParamBuilders.img;
        }
    };
    IHttpCell search = new IHttpCell() {
        @Override
        public IHost getHost() {
            return Hosts.defaults;
        }

        @Override
        public String getUA() {
            return "";
        }

        @Override
        public IResultParse getResultParse() {
            return new ParseSearch<List<String>>();
        }

        @Override
        public IParamBuilder getParamBuilder() {
            return null;
        }
    };
}
