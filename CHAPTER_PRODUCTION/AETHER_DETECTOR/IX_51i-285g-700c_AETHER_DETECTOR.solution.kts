
solution {
    puzzle = "P077"
    name = "B IC 1-6T"
    arm(ARM1) {
        number = 1
        position = 1 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -3 to 0
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -1 to 2
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to -1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 7 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 8 to -2
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = 6 to 2
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 8 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 6 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 10 to 0
        rotation = 2
    }
    track {
        position = 2 to -1
        positions = listOf(0 to 1, 0 to 0, 0 to -1, -1 to 0)
    }
    track {
        position = 10 to -2
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
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
                wait(15)
                grab()
                rotateClockwise()
                extend()
                extend()
                pivotClockwise()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(17)
                grab()
                retract()
                wait(13)
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(30)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                drop()
                wait(3)
                grab()
                pivotCounterClockwise()
                wait(1)
                back()
                drop()
                forward()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(20)
                grab()
                pivotClockwise()
                wait(10)
                back()
                back()
                drop()
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                grab()
                back()
                pivotCounterClockwise()
                drop()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
