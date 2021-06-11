
solution {
    puzzle = "P060"
    name = "B CI89 3T"
    arm(ARM1) {
        number = 1
        position = -1 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -1 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -2 to -3
        rotation = 0
        size = 2
    }
    arm(ARM3) {
        number = 5
        position = -2 to -4
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = 3 to -7
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 7
        position = 6 to -5
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 5 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 5 to 0
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 10
        position = 2 to 3
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = 1 to -2
        rotation = 1
        size = 3
    }
    arm(ARM3) {
        number = 12
        position = -3 to -3
        rotation = 0
        size = 3
    }
    arm(ARM2) {
        number = 13
        position = -4 to -2
        rotation = -1
        size = 3
    }
    glyph(BONDER) {
        position = -6 to -5
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to -5
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -7
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -3 to 0
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 0 to 3
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 5 to -2
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 0 to -5
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -4
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -8 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -8 to -1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -1 to -6
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 1 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 4 to -2
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -2 to -1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -7 to 1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 3 to -4
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 2 to 1
        rotation = 0
    }
    track {
        position = 5 to 0
        positions = listOf(0 to 1, 0 to 0, -1 to 1)
    }
    track {
        position = -5 to -3
        positions = listOf(0 to 1, 0 to 2, 1 to 2, 2 to 1, 3 to 0, 4 to 0, 3 to 1)
    }
    track {
        position = -4 to -3
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 0 to 0
        positions = listOf(-2 to 4, -2 to 3, -2 to 2, -1 to 1, -1 to 0, -1 to -1, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(8) {
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                rotateClockwise()
                drop()
                back()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(11) {
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(5)
                back()
                grab()
                rotateCounterClockwise()
                back()
                rotateClockwise()
                drop()
                back()
            }
        }
        , 
        {
            sequence(10) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(7)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                back()
                forward()
                rotateClockwise()
                drop()
                back()
                back()
                back()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                back()
                back()
                grab()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                forward()
                grab()
                forward()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(9)
                grab()
                back()
                wait(1)
                back()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
