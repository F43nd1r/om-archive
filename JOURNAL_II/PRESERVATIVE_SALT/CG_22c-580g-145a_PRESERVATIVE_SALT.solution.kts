
solution {
    puzzle = "P060"
    name = "B CG 6T"
    arm(ARM1) {
        number = 1
        position = -1 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 3 to -7
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to -3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -2 to -4
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 6 to -5
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 5 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 5 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 2 to 3
        rotation = -2
        size = 2
    }
    arm(ARM3) {
        number = 9
        position = -3 to -3
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 1 to -2
        rotation = 1
        size = 3
    }
    arm(ARM2) {
        number = 11
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
        position = -2 to -1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 1 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 4 to -2
        rotation = 2
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
        position = -5 to -3
        positions = listOf(1 to 0, 1 to 1, 2 to 1, 3 to 0)
    }
    track {
        position = 5 to 0
        positions = listOf(0 to 1, 0 to 0, -1 to 1)
    }
    track {
        position = 0 to 0
        positions = listOf(-2 to 2, -1 to 1, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                forward()
                wait(1)
                forward()
                wait(1)
                back()
                drop()
                forward()
                wait(7)
                reset()
                wait(2)
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                rotateClockwise()
                drop()
                back()
                wait(1)
                back()
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(7)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                forward()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                back()
                grab()
                rotateCounterClockwise()
                back()
                rotateClockwise()
                drop()
                back()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                back()
                forward()
                rotateClockwise()
                reset()
                wait(1)
                back()
                grab()
                back()
                forward()
                forward()
                rotateClockwise()
                reset()
                wait(10)
                back()
                grab()
                forward()
            }
        }
        )
    }
}
