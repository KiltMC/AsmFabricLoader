/*
 * This file is part of AsmFabricLoader - https://github.com/FlorianMichael/AsmFabricLoader
 * Copyright (C) 2023-2025 FlorianMichael/EnZaXD <florian.michael07@gmail.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.florianmichael.asmfabricloader.loader.feature.classtransform;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ClassTransformJson {
    @SerializedName("package")
    private String packageName;

    @SerializedName("java")
    private List<String> javaTransformers;

    @SerializedName("mixins")
    private List<String> mixinTransformers;

    public ClassTransformJson(String packageName, List<String> javaTransformers, List<String> mixinTransformers) {
        this.packageName = packageName;
        this.javaTransformers = javaTransformers;
        this.mixinTransformers = mixinTransformers;
    }

    public String packageName() {
        return packageName;
    }

    public List<String> javaTransformers() {
        return javaTransformers;
    }

    public List<String> mixinTransformers() {
        return mixinTransformers;
    }
}
