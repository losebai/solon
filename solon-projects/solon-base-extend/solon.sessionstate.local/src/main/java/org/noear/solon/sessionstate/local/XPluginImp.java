package org.noear.solon.sessionstate.local;

import org.noear.solon.Solon;
import org.noear.solon.core.AopContext;
import org.noear.solon.core.Bridge;
import org.noear.solon.core.Plugin;
import org.noear.solon.core.util.LogUtil;

public class XPluginImp implements Plugin {
    @Override
    public void start(AopContext context) {
        if (Solon.app().enableSessionState() == false) {
            return;
        }

        if (Solon.app().chainManager().getSessionStateFactory().priority()
                >= LocalSessionStateFactory.SESSION_STATE_PRIORITY) {
            return;
        }

        Solon.app().chainManager().setSessionStateFactory(LocalSessionStateFactory.getInstance());

        LogUtil.global().info("Session: Local session state plugin is loaded");
    }
}
