/*
 * Copyright 2018 Mitsunori Komatsu (komamitsu)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.komamitsu.fluency.ingester.sender.treasuredata;

class Response<T>
{
    private final String request;
    private final boolean success;
    private final int statusCode;
    private final String reasonPhrase;
    private final T content;

    Response(String request, boolean success, int statusCode, String reasonPhrase, T content)
    {
        this.request = request;
        this.success = success;
        this.statusCode = statusCode;
        this.reasonPhrase = reasonPhrase;
        this.content = content;
    }

    public String getRequest()
    {
        return request;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    public String getReasonPhrase()
    {
        return reasonPhrase;
    }

    public T getContent()
    {
        return content;
    }
}
