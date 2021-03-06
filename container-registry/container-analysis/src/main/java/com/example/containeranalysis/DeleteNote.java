/*
 * Copyright 2019 Google LLC
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

package com.example.containeranalysis;

// [START containeranalysis_delete_note]
import com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client;
import com.google.containeranalysis.v1beta1.NoteName;
import java.io.IOException;
import java.lang.InterruptedException;

public class DeleteNote {
  // Deletes an existing Note from the server
  public static void deleteNote(String noteId, String projectId) 
      throws IOException, InterruptedException {
    // String noteId = "my-note";
    // String projectId = "my-project-id";
    final NoteName noteName = NoteName.of(projectId, noteId);

    // Initialize client that will be used to send requests. After completing all of your requests, 
    // call the "close" method on the client to safely clean up any remaining background resources.
    GrafeasV1Beta1Client client = GrafeasV1Beta1Client.create();
    client.deleteNote(noteName);
  }
}
// [END containeranalysis_delete_note]
