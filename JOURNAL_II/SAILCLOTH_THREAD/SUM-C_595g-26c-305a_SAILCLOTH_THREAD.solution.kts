
solution {
    puzzle = "P061"
    name = "B CX 6T"
    arm(ARM1) {
        number = 1
        position = 9 to -11
        rotation = 1
        size = 3
    }
    arm(ARM3) {
        number = 2
        position = 5 to -8
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 5 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 2 to -3
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 1 to -2
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 0 to -1
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -1 to 0
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 13 to -8
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 12 to -7
        rotation = 3
        size = 3
    }
    arm(ARM3) {
        number = 10
        position = 6 to 0
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = 13 to -7
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 8 to 0
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 8 to 2
        rotation = 9
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = 9 to -2
        rotation = 8
        size = 1
    }
    arm(ARM1) {
        number = 15
        position = -1 to 5
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 5 to -3
        rotation = 2
    }
    glyph(BONDER) {
        position = 3 to 3
        rotation = 3
    }
    glyph(BONDER) {
        position = 5 to 2
        rotation = 8
    }
    glyph(BONDER) {
        position = 4 to -7
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 8 to -4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 10 to -6
        rotation = 7
    }
    glyph(UNBONDER) {
        position = 6 to -8
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 6 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 4 to -4
        rotation = 6
    }
    glyph(DUPLICATION) {
        position = 9 to -3
        rotation = 4
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -16 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 10 to -8
        rotation = 2
    }
    io(INFINITE) {
        index = 0
        position = -15 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 8 to -1
        rotation = 0
    }
    track {
        position = 13 to -8
        positions = listOf(0 to 0, -1 to 0, -2 to 1, -1 to 1)
    }
    track {
        position = 5 to -1
        positions = listOf(1 to 1, 1 to 0, 0 to 0, -1 to 0, -2 to 0, -3 to 0, -4 to 0)
    }
    track {
        position = 11 to -1
        positions = listOf(-4 to 2, -3 to 1, -4 to 1)
    }
    track {
        position = 0 to -2
        positions = listOf(1 to -1, 0 to 0, -1 to 1, -2 to 2, -1 to 2, 0 to 1, 1 to 0, 2 to -1)
    }
    track {
        position = 13 to -6
        positions = listOf(0 to -1, 0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(11) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                forward()
                wait(1)
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                rotateClockwise()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                forward()
                reset()
                repeat()
                wait(7)
                grab()
                rotateClockwise()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(15) {
                wait(22)
                grab()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(3)
                forward()
                back()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                forward()
                forward()
                rotateClockwise()
                forward()
                forward()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(7)
                forward()
                grab()
                rotateClockwise()
                forward()
                forward()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(14) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateClockwise()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(12) {
                wait(3)
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                back()
                pivotClockwise()
                back()
                forward()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                back()
                wait(2)
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                drop()
                forward()
                rotateClockwise()
                forward()
                forward()
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                wait(2)
                forward()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                forward()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                drop()
                forward()
                rotateClockwise()
                forward()
                forward()
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                forward()
                wait(5)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                drop()
                forward()
                reset()
                wait(1)
                forward()
                wait(7)
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(3)
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
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
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                forward()
                rotateClockwise()
                drop()
                wait(5)
                forward()
                forward()
                forward()
                wait(1)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                forward()
                wait(4)
                grab()
                back()
                back()
                drop()
                forward()
            }
        }
        )
    }
}
