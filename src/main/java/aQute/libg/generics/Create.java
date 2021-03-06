/**
 * Copy of the code from github.com/bndtools/bnd, reason: not available at Maven central or other repository
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

package aQute.libg.generics;

import java.util.*;

public class Create {

	public static <K, V> Map<K,V> map() {
		return new LinkedHashMap<K,V>();
	}

	public static <K, V> Map<K,V> map(Class<K> key, Class<V> value) {
		return Collections.checkedMap(new LinkedHashMap<K,V>(), key, value);
	}

	public static <T> List<T> list() {
		return new ArrayList<T>();
	}

	public static <T> List<T> list(Class<T> c) {
		return Collections.checkedList(new ArrayList<T>(), c);
	}

	public static <T> Set<T> set() {
		return new HashSet<T>();
	}

	public static <T> Set<T> set(Class<T> c) {
		return Collections.checkedSet(new HashSet<T>(), c);
	}

	public static <T> List<T> list(T[] source) {
		return new ArrayList<T>(Arrays.asList(source));
	}

	public static <T> Set<T> set(T[] source) {
		return new HashSet<T>(Arrays.asList(source));
	}

	public static <K, V> Map<K,V> copy(Map<K,V> source) {
		return new LinkedHashMap<K,V>(source);
	}

	public static <T> List<T> copy(List<T> source) {
		return new ArrayList<T>(source);
	}

	public static <T> Set<T> copy(Collection<T> source) {
		if (source == null)
			return set();
		return new HashSet<T>(source);
	}

}
