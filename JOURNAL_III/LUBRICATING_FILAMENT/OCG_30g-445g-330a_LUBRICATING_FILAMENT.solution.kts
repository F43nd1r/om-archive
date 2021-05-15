
solution {
    puzzle = "P065"
    name = "OVERLAP G"
    arm(ARM1) {
        number = 1
        position = -3 to 4
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -3 to 5
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 0 to 3
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -8 to 1
        rotation = 18
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -6 to 0
        rotation = 18
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 6 to -4
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 6 to -3
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 5 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 1 to -6
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -5 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -5 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 2
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -5 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -5 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 5 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 4 to 0
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = 8 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -5 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -5 to 1
        rotation = 0
    }
    track {
        position = -8 to 2
        positions = listOf(0 to 0, 1 to -1, 2 to -2, 2 to -1, 1 to 0)
    }
    track {
        position = -8 to 1
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -3 to 4
        positions = listOf(0 to 1, 1 to 0, 2 to -1, 3 to -2, 4 to -2, 3 to -1, 2 to 0, 1 to 1)
    }
    track {
        position = -3 to 4
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 6 to -4
        positions = listOf(0 to 0, 0 to 1, -1 to 1)
    }
    track {
        position = 0 to -6
        positions = listOf(-1 to 2, 0 to 1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(4) {
                grab()
                forward()
                pivotClockwise()
                forward()
                drop()
                forward()
                forward()
                wait(2)
                forward()
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                forward()
                forward()
                wait(2)
                forward()
                grab()
                forward()
                pivotClockwise()
                forward()
                drop()
                repeat()
                wait(9)
                forward()
                forward()
                wait(2)
                forward()
                grab()
                forward()
                forward()
                drop()
                back()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                pivotClockwise()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                wait(2)
                forward()
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                grab()
                forward()
                pivotClockwise()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                wait(2)
                forward()
                grab()
                forward()
                pivotClockwise()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                forward()
                forward()
                wait(2)
                forward()
                grab()
                forward()
                pivotClockwise()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                wait(2)
                forward()
                grab()
                forward()
                forward()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                drop()
                grab()
                forward()
                rotateClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                grab()
                forward()
                rotateClockwise()
                wait(1)
                pivotCounterClockwise()
                rotateClockwise()
                forward()
            }
        }
        , 
        {
            sequence(6) {
                wait(7)
                grab()
                rotateClockwise()
                wait(1)
                forward()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                grab()
                forward()
                rotateClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(9)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(13)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                pivotCounterClockwise()
                wait(9)
                rotateClockwise()
            }
        }
        )
    }
}
