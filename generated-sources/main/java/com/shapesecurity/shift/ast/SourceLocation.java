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

import org.jetbrains.annotations.NotNull;

public class SourceLocation implements Node {

    @NotNull
    public final Integer line;

    @NotNull
    public final Integer column;

    @NotNull
    public final Integer offset;

    public SourceLocation(@NotNull Integer line, @NotNull Integer column, @NotNull Integer offset) {
        super();
        this.line = line;
        this.column = column;
        this.offset = offset;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof SourceLocation && this.line.equals(((SourceLocation) object).line) &&
               this.column.equals(((SourceLocation) object).column) && this.offset.equals(
            ((SourceLocation) object).offset);
    }

    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "SourceLocation");
        code = HashCodeBuilder.put(code, this.line);
        code = HashCodeBuilder.put(code, this.column);
        code = HashCodeBuilder.put(code, this.offset);
        return code;
    }

    @NotNull
    public Integer getLine() {
        return this.line;
    }

    @NotNull
    public SourceLocation setLine(@NotNull Integer line) {
        return new SourceLocation(line, this.column, this.offset);
    }

    @NotNull
    public Integer getColumn() {
        return this.column;
    }

    @NotNull
    public SourceLocation setColumn(@NotNull Integer column) {
        return new SourceLocation(this.line, column, this.offset);
    }

    @NotNull
    public Integer getOffset() {
        return this.offset;
    }

    @NotNull
    public SourceLocation setOffset(@NotNull Integer offset) {
        return new SourceLocation(this.line, this.column, offset);
    }

}