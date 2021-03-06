// Generated by src/generate-spec-java.js 

/*
 * Copyright 2015 Shape Security, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.shapesecurity.shift.ast;

import com.shapesecurity.functional.data.HashCodeBuilder;
import com.shapesecurity.functional.data.ImmutableList;
import com.shapesecurity.functional.data.Maybe;

import org.jetbrains.annotations.NotNull;

public class FormalParameters implements Node {

    @NotNull
    public final ImmutableList<BindingBindingWithDefault> items;

    @NotNull
    public final Maybe<BindingIdentifier> rest;

    public FormalParameters(@NotNull ImmutableList<BindingBindingWithDefault> items,
                            @NotNull Maybe<BindingIdentifier> rest) {
        super();
        this.items = items;
        this.rest = rest;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof FormalParameters && this.items.equals(((FormalParameters) object).items) &&
               this.rest.equals(((FormalParameters) object).rest);
    }

    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "FormalParameters");
        code = HashCodeBuilder.put(code, this.items);
        code = HashCodeBuilder.put(code, this.rest);
        return code;
    }

    @NotNull
    public ImmutableList<BindingBindingWithDefault> getItems() {
        return this.items;
    }

    @NotNull
    public FormalParameters setItems(@NotNull ImmutableList<BindingBindingWithDefault> items) {
        return new FormalParameters(items, this.rest);
    }

    @NotNull
    public Maybe<BindingIdentifier> getRest() {
        return this.rest;
    }

    @NotNull
    public FormalParameters setRest(@NotNull Maybe<BindingIdentifier> rest) {
        return new FormalParameters(this.items, rest);
    }

}