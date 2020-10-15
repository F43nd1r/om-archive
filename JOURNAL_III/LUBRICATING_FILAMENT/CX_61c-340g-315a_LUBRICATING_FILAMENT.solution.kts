
solution {
    puzzle = "P065"
    name = "B CX 6T"
    arm(ARM1) {
        number = 1
        position = 2 to -4
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -3 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 3 to 1
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 3 to 0
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 3 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 3 to -3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 2 to 2
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 3
    }
    glyph(MULTI_BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 0 to 3
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 13 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -6 to 7
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    track {
        position = 3 to -4
        positions = listOf(0 to 0, -1 to 1, -1 to 0)
    }
    track {
        position = -1 to -2
        positions = listOf(-2 to 2, -2 to 1, -1 to 1, 0 to 0, -1 to 0, -1 to -1, 0 to -2)
    }
    track {
        position = 2 to 1
        positions = listOf(0 to 4, 0 to 3, 0 to 2, 0 to 1, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(4) {
                grab()
                rotateClockwise()
                wait(2)
                pivotCounterClockwise()
                back()
                reset()
                wait(3)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
                wait(7)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateCounterClockwise()
                wait(2)
                back()
                back()
                drop()
                back()
                reset()
                wait(1)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                pivotCounterClockwise()
                drop()
                back()
                back()
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                back()
                back()
                back()
                reset()
                wait(5)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                forward()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(9)
                forward()
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                back()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                back()
                wait(3)
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                back()
                wait(3)
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                back()
                wait(3)
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                back()
                wait(3)
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                back()
                reset()
            }
        }
        )
    }
}
