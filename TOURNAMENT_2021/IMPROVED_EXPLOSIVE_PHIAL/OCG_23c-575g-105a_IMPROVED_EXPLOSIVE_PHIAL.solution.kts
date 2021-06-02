
solution {
    puzzle = "w2450508212"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = -3 to 5
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -3 to 4
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to 6
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 2 to 3
        rotation = 3
        size = 2
    }
    arm(ARM2) {
        number = 5
        position = 2 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 3 to 3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 4 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 4 to 1
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 1 to 1
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -5 to 3
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = -5 to 1
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = -6 to 3
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = -3 to -4
        rotation = 1
        size = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = -3 to 3
        rotation = 4
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to 1
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -1
        rotation = 2
    }
    glyph(TRIPLEX_BONDER) {
        position = 3 to -2
        rotation = -1
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to -2
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 5 to -5
        rotation = -10
    }
    glyph(TRIPLEX_BONDER) {
        position = 0 to -2
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -5
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -4
        rotation = 1
    }
    track {
        position = -3 to 5
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = 2 to 3
        positions = listOf(0 to 0, 0 to -1, 0 to -2)
    }
    track {
        position = 3 to 3
        positions = listOf(1 to 0, 0 to 0, 0 to -1, 0 to -2, 1 to -2, 1 to -1)
    }
    track {
        position = -5 to 3
        positions = listOf(0 to 0, 0 to -1, 0 to -2, -1 to -1, -1 to 0)
    }
    track {
        position = 0 to 6
        positions = listOf(0 to 0, 0 to -1, 0 to -2, 1 to -3)
    }
    track {
        position = 1 to 1
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                back()
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                rotateClockwise()
                forward()
                forward()
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                forward()
                drop()
                forward()
                drop()
                drop()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                rotateClockwise()
                forward()
                drop()
                forward()
                drop()
                drop()
                forward()
                drop()
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                rotateClockwise()
                forward()
                forward()
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(10) {
                wait(2)
                grab()
                forward()
                forward()
                rotateClockwise()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                drop()
                forward()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(2)
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                drop()
                forward()
                drop()
                grab()
                forward()
                forward()
                rotateClockwise()
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(2)
                drop()
                drop()
                forward()
                drop()
                grab()
                forward()
                forward()
                rotateClockwise()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                forward()
                forward()
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                forward()
                drop()
                forward()
                drop()
                drop()
                forward()
                drop()
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(9) {
                wait(5)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                wait(1)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                forward()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                repeat()
                wait(7)
                repeat()
            }
        }
        )
    }
}
