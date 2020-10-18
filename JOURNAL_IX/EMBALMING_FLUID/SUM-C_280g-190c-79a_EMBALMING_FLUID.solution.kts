
solution {
    puzzle = "P108"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = -9 to 4
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -8 to 4
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -4 to 3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -10 to 1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -9 to -1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -8 to -2
        rotation = -2
        size = 1
    }
    arm(ARM6) {
        number = 7
        position = -5 to -3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -6 to -1
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -6 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -5 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -7 to 4
        rotation = -1
    }
    glyph(BONDER) {
        position = -5 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -10 to 3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -7 to -3
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -8 to 3
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -7 to -2
        rotation = 1
    }
    glyph(DISPOSAL) {
        position = -8 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -8 to -3
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -10 to 4
        rotation = 2
    }
    io(INPUT) {
        index = 2
        position = -8 to 5
        rotation = 0
    }
    track {
        position = -5 to 3
        positions = listOf(2 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(2)
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
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(14)
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                wait(5)
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(7)
                grab()
                rotateCounterClockwise()
                reset()
                wait(7)
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
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(14)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(5)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(9)
                repeat()
            }
        }
        )
    }
}
