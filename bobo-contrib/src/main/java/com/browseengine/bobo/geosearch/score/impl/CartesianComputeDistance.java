/**
 * This software is licensed to you under the Apache License, Version 2.0 (the
 * "Apache License").
 *
 * LinkedIn's contributions are made under the Apache License. If you contribute
 * to the Software, the contributions will be deemed to have been made under the
 * Apache License, unless you expressly indicate otherwise. Please do not make any
 * contributions that would be inconsistent with the Apache License.
 *
 * You may obtain a copy of the Apache License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, this software
 * distributed under the Apache License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the Apache
 * License for the specific language governing permissions and limitations for the
 * software governed under the Apache License.
 *
 * © 2012 LinkedIn Corp. All Rights Reserved.  
 */

package com.browseengine.bobo.geosearch.score.impl;

/**
 * 
 * @author gcooney
 *
 */
public class CartesianComputeDistance {
    public static double computeDistanceSquared(int x1, int y1, int z1, 
            int x2, int y2, int z2) {
        double xsq = Math.pow((double)x1 - (double)x2, 2);
        double ysq = Math.pow((double)y1 - (double)y2, 2);
        double zsq = Math.pow((double)z1 - (double)z2, 2);
        return xsq + ysq + zsq;
    }
    
    public static double computeDistance(int x1, int y1, int z1, 
            int x2, int y2, int z2) {
        return Math.sqrt(computeDistanceSquared(x1, y1, z1, x2, y2, z2));
    }
}