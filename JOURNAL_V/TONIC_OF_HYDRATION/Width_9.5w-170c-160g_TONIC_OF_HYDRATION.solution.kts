
solution {
    puzzle = "P089"
    name = "450 SUM4"
    arm(ARM1) {
        number = 1
        position = -5 to 4
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to -2
        rotation = 8
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -5 to 2
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 0 to -1
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 7 to 0
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 7
    }
    glyph(BONDER) {
        position = -4 to 3
        rotation = 5
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 5
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 1
        rotation = 7
    }
    io(INPUT) {
        index = 1
        position = -5 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 1 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(16)
                grab()
                pivotClockwise()
                drop()
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
