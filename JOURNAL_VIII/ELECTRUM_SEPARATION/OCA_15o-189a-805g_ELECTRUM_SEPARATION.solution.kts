
solution {
    puzzle = "P103"
    name = "OVERLAP"
    arm(PISTON) {
        number = 1
        position = -1 to 4
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 0 to 3
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 7 to -5
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 2 to -3
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 11 to -7
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 6 to -5
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 5 to 5
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -6 to 6
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 1 to -1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 5 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to 2
        rotation = 2
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 3
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 3
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = -2
    }
    glyph(BONDER) {
        position = 4 to -3
        rotation = 2
    }
    glyph(BONDER) {
        position = 4 to -2
        rotation = -2
    }
    glyph(BONDER) {
        position = 3 to 4
        rotation = 3
    }
    glyph(BONDER) {
        position = -5 to 5
        rotation = 3
    }
    glyph(BONDER) {
        position = 0 to 5
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 4
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 7 to -3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 8 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 3 to -1
        rotation = 6
    }
    glyph(UNBONDER) {
        position = 5 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 4 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 4 to 0
        rotation = 5
    }
    glyph(UNBONDER) {
        position = 4 to 1
        rotation = 4
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to -1
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 3 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to 1
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -11 to 5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 4 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to 0
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 3 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 4 to 3
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 2 to 4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 3 to 5
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 2 to 4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to 2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to 3
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 1 to 2
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 1 to 1
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 1 to 2
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 2 to -1
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 4 to -2
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 3 to -2
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 4 to 3
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 1 to 5
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 3 to 0
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 4 to -1
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 2 to 0
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 3 to -1
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 2 to 3
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -16 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to 0
        rotation = 4
    }
    io(INFINITE) {
        index = 1
        position = -10 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 5 to 0
        rotation = -1
    }
    track {
        position = 7 to -5
        positions = listOf(0 to 0, 0 to -1, 0 to -2, 0 to -3, 0 to -4)
    }
    track {
        position = 11 to -7
        positions = listOf(0 to 0, -1 to 0, -2 to 1, -3 to 2, -4 to 3, -5 to 4)
    }
    track {
        position = 6 to -5
        positions = listOf(-1 to 0, 0 to -1, 0 to -2, 0 to -3, 0 to -4)
    }
    track {
        position = 6 to -5
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = 2 to -6
        positions = listOf(0 to 3, -1 to 3, -2 to 3, -3 to 3, -4 to 3, -5 to 4)
    }
    track {
        position = -1 to 4
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -3 to 0, -4 to 0, -5 to 0, -6 to 0, -7 to 0, -8 to 0, -9 to 0, -10 to 0)
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = 5 to 5
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 3 to 0, 3 to 1, 2 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateClockwise()
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
            sequence(6) {
                grab()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                back()
                back()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                retract()
                pivotCounterClockwise()
                retract()
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
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(8) {
                wait(7)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                grab()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                wait(6)
                forward()
            }
        }
        )
    }
}
