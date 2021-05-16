
solution {
    puzzle = "P103"
    name = "B F"
    arm(ARM1) {
        number = 1
        position = -5 to 2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -4 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to 0
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 1 to 2
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 1 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 4 to -1
        rotation = 3
        size = 2
    }
    arm(ARM6) {
        number = 7
        position = 2 to 2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to 5
        rotation = 2
    }
    io(INFINITE) {
        index = 0
        position = 3 to 3
        rotation = 0
    }
    io(INFINITE) {
        index = 1
        position = 4 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = -3 to -1
        rotation = -4
    }
    track {
        position = 2 to 2
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                wait(2)
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(20)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(14)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(2)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(11)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
