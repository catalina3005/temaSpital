//package com.example.temaspital.Controller;
//
//import com.example.temaspital.Model.Specialty;
//import com.example.temaspital.Model.Visit;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class VisitController {
//    @Autowired
//    VisitService visitService;
//
//    @GetMapping("visits")
//    public List<Visit> getAllVisitByCnpAndSpeciality(@RequestParam String cnp, @RequestParam Specialty specialty){
//        return visitService.getVisitsByCnpAndSpeciality(cnp, specialty);
//    }
//
//
//    @PostMapping("visits/add")
//    public Visit addVisit(@RequestBody Visit visit){
//        return visitService.addVisit(visit);
//    }
//
//}