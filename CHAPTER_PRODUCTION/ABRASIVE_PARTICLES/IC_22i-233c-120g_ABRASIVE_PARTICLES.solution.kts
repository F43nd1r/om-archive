
solution {
    puzzle = "P079"
    name = "II"
    arm(PISTON) {
        number = 1
        position = 2 to 0
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -2 to -1
        rotation = 6
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 2 to -1
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 1
        rotation = -1
    }
    conduit {
        id = 100
        position = 6 to 0
        rotation = 0
    }
    conduit {
        id = 100
        position = -3 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                extend()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                retract()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                grab()
                pivotClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
