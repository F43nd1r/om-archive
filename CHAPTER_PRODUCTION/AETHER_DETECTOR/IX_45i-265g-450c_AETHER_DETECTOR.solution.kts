
solution {
    puzzle = "P077"
    name = "I"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to -2
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = 1 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 8 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 7 to -1
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = 6 to 2
        rotation = 4
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 8 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 6 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 10 to 0
        rotation = 1
    }
    track {
        position = -1 to -2
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 3 to 0, 2 to 1, 3 to 1)
    }
    track {
        position = 8 to -2
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    conduit {
        id = 100
        position = 6 to 0
        rotation = 0
    }
    conduit {
        id = 100
        position = 0 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(10)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                drop()
                wait(1)
                grab()
                pivotClockwise()
                back()
                pivotClockwise()
                drop()
                back()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(11)
                back()
                grab()
                forward()
                wait(1)
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(22)
                grab()
                retract()
                wait(3)
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(25)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(13)
                grab()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                grab()
                back()
                back()
                drop()
            }
        }
        )
    }
}
