
solution {
    puzzle = "P095"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = -1 to 3
        rotation = -1
        size = 1
    }
    arm(ARM3) {
        number = 2
        position = -1 to 0
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -1 to -1
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = -2
    }
    glyph(PROJECTION) {
        position = 0 to 2
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -2 to 3
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 3
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                extend()
                reset()
            }
        }
        )
    }
}
