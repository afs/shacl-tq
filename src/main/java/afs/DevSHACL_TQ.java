/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package afs;

import java.io.IOException;

import org.apache.jena.atlas.logging.LogCtl;
import org.apache.jena.sys.JenaSystem;

public class DevSHACL_TQ {

    public static void main(String[] args) throws IOException {
//        Graph graph = RDFDataMgr.loadGraph("/home/afs/tmp/shapes.ttl");
//        SHACLCWriter w = new SHACLCWriter();
//        PrefixMap pmap = Prefixes.adapt(graph.getPrefixMapping());
//        w.write(System.out, graph, pmap, null,null);



        String DIR = "/home/afs/tmp/SHACL/";
        String FILE = DIR+"core/targets/targetNode-001.ttl";

//        String[] a = {"-datafile", "/home/afs/tmp/X/demo.ttl",
//                      "-shapesfile", "/home/afs/tmp/X/demo.ttl"};

        String[] a = {"-datafile", DIR+"r-data.ttl", "-shapesfile", DIR+"r-shape.ttl"};

        System.setProperty("log4j.configurationFile", "file:log4j2.properties");
        LogCtl.setLog4j2();

        JenaSystem.init();

        org.topbraid.shacl.tools.Validate.main(a);

//        String[] a = {"-datafile", FILE, "-shapesfile", FILE};
//        org.topbraid.shacl.tools.Validate.main(a);

//        Model model = RDFDataMgr.loadModel(FILE);
//        Model dataModel = model;
//        Model shapesModel = model;
//
//        Resource report = ValidationUtil.validateModel(dataModel, shapesModel, false);
//        report.getModel().write(System.out, FileUtils.langTurtle);
//
//        System.out.println();
//        RDFDataMgr.write(System.out, model, Lang.TTL);


    }

}
