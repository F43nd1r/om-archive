
solution {
    puzzle = "P077"
    name = "INSTRUCTIONS"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = -4
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
        position = 2 to 0
        rotation = -4
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = 7 to 1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 9 to 1
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 7 to 2
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = 8 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 6 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 10 to -1
        rotation = 1
    }
    track {
        position = 0 to -2
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 1 to -2
        positions = listOf(0 to 0, 1 to 0, 0 to 1, 1 to 1, 1 to 2)
    }
    track {
        position = 8 to 2
        positions = listOf(-2 to 0, -1 to 0, 0 to -1, 1 to -1, 2 to -1)
    }
    conduit {
        id = 100
        position = 7 to 0
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
            sequence(5) {
                wait(14)
                rotateCounterClockwise()
                drop()
                wait(15)
                grab()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
            }
        }
        , 
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
                wait(5)
                extendTape()
            }
        }
        , 
        {
            sequence(7) {
                wait(24)
                grab()
                back()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(14)
                pivotClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                wait(9)
                grab()
                back()
                back()
            }
        }
        , 
        {
            sequence(4) {
                wait(15)
                back()
                drop()
                back()
                grab()
                forward()
                forward()
            }
        }
        )
    }
}
