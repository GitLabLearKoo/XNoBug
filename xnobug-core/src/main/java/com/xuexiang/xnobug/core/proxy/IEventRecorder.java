/*
 * Copyright (C) 2019 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.xuexiang.xnobug.core.proxy;

import android.content.Context;

import java.util.Map;

/**
 * 事件记录者的实现接口
 *
 * @author xuexiang
 * @since 2019-06-14 15:34
 */
public interface IEventRecorder {

    /**
     * 记录事件
     *
     * @param context
     * @param eventID    事件ID
     * @param eventLabel 事件名
     */
    void recordEvent(Context context, String eventID, String eventLabel);

    /**
     * 记录事件
     *
     * @param context
     * @param eventID    事件ID
     * @param eventLabel 事件名
     * @param eventData  事件携带的数据
     */
    void recordEvent(Context context, String eventID, String eventLabel, Map<String, Object> eventData);

}
