package com.k_int.termserv

class ContextController {

  def index() { 
  }

  def lookup() {
    log.debug("Lookup term ${params.q}");
    def result = [:]

    // Try to find a term where candidate_identifier == params.q

    // If params.add=true and the term is not found, check for it's presence in the candidate term list and add it if not found.
    result;
  }
}
