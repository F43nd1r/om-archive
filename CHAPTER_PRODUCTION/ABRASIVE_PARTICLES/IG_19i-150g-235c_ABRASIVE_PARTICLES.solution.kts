
solution {
    puzzle = "P079"
    name = "II"
    arm(PISTON) {
        number = 1
        position = 2 to 0
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -2 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to -2
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 1 to -2
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 2
    }
    track {
        position = -1 to -2
        positions = listOf(0 to 0, 1 to 0)
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
                wait(3)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                extend()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                retract()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                forward()
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                extend()
                pivotCounterClockwise()
                reset()
                wait(8)
                extendTape()
            }
        }
        )
    }
}
