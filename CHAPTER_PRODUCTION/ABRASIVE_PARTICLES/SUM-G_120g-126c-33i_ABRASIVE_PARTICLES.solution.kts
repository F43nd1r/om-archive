
solution {
    puzzle = "P079"
    name = "B X S"
    arm(PISTON) {
        number = 1
        position = 2 to 0
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -2 to -1
        rotation = 0
        size = 3
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
        rotation = -3
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
            sequence(2) {
                wait(2)
                grab()
                retract()
                extend()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                retract()
                extend()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                retract()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                grab()
                retract()
                drop()
                extend()
                wait(1)
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                reset()
            }
        }
        )
    }
}
