/*
 * Copyright 2015 Shao Tian-Chen (Austin)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.au9ustine.puzzles.s99

/**
 *  Problem 20: Remove the Kth element from a list.
 *  Return the list and the removed element in a Tuple. Elements are numbered from 0.
 *
 *  Example:
 *
 *  scala> removeAt(1, List('a, 'b, 'c, 'd))
 *  res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
 */
object P20 {
  def removeAt[A](n: Int, lst: List[A]): (List[A], A) = (lst.take(n) ::: lst.drop(n+1), lst(n))
}
