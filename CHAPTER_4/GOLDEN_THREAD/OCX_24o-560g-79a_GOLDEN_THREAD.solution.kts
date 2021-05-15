
solution {
    puzzle = "P037"
    name = "OVERLAP A"
    arm(ARM1) {
        number = 1
        position = 6 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 7 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 8 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 9 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 10 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 10 to -2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 10 to -1
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -5 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 5 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 6 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 6 to 0
        rotation = -4
    }
    glyph(BONDER) {
        position = 6 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 6 to 0
        rotation = -5
    }
    glyph(BONDER) {
        position = 6 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 5 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 4 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 5 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 5 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 5 to 2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 7 to 1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 6 to 2
        rotation = -2
    }
    io(INFINITE) {
        index = 0
        position = -5 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 9 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 7 to -1
        rotation = 0
    }
    track {
        position = 6 to -2
        positions = listOf(2 to 0, 2 to 1, 2 to 2, 3 to 2, 4 to 1, 4 to 0, 4 to -1, 3 to -1, 2 to -1, 1 to 0, 0 to 0, -1 to 0, -2 to 0, -3 to 0, -4 to 0, -5 to 0, -6 to 0, -7 to 0, -8 to 0, -9 to 0, -10 to 0, -11 to 0)
    }
    tape {
        parallel(
        {
            sequence(7) {
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                wait(1)
                back()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(2)
                back()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                back()
                wait(1)
                forward()
                wait(1)
                forward()
                rotateClockwise()
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(1) {
                wait(9)
                back()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(2) {
                wait(9)
                back()
                wait(1)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(5) {
                wait(9)
                back()
                wait(1)
                forward()
                rotateClockwise()
                forward()
                wait(1)
                forward()
                rotateClockwise()
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                back()
                wait(1)
                forward()
                rotateClockwise()
                forward()
                wait(1)
                rotateClockwise()
                forward()
                forward()
                rotateClockwise()
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
            }
        }
        , 
        {
            sequence(3) {
                wait(9)
                back()
                wait(1)
                forward()
                rotateClockwise()
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
            }
        }
        )
    }
}
