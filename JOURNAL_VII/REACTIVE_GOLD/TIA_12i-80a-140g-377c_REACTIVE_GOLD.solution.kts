
solution {
    puzzle = "P095"
    name = "NEW SOLUTION 7 (Copy) (Copy)"
    arm(ARM3) {
        number = 1
        position = 0 to 1
        rotation = 4
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = -1 to -1
        rotation = -6
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 1 to 0
        rotation = -6
        size = 1
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = -5
    }
    glyph(PROJECTION) {
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = -12
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = -4
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                extend()
                extend()
                drop()
                retract()
                retract()
            }
        }
        )
    }
}
