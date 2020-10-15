
solution {
    puzzle = "P096"
    name = "B CG 6T"
    arm(ARM1) {
        number = 1
        position = 5 to -4
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 4 to -3
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 4 to -4
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 7 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 7 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 6 to 1
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 10 to -5
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 9 to -8
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 3 to -5
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -1 to 2
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = -1 to 1
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 0 to 1
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = -3 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = -4 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 15
        position = -7 to 4
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 16
        position = -5 to 5
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 5 to -5
        rotation = 0
    }
    glyph(BONDER) {
        position = 6 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -5 to 4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 6 to -3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 4 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 8 to -4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -5 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -6
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -3 to 2
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 7 to -7
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = -2
    }
    io(OUTPUT) {
        index = 1
        position = 10 to -2
        rotation = -3
    }
    io(OUTPUT) {
        index = 2
        position = -3 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = -2 to -3
        rotation = 1
    }
    track {
        position = 4 to -3
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = 7 to 1
        positions = listOf(0 to 0, -1 to 0, 0 to -1)
    }
    track {
        position = -1 to 2
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = -5 to -1
        positions = listOf(0 to 0, 1 to -1, 2 to -1, 1 to 0)
    }
    track {
        position = -4 to 5
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 3 to -5
        positions = listOf(-1 to 1, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                pivotClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
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
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                pivotClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                pivotClockwise()
                rotateClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                back()
                wait(2)
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(4)
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                pivotClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                pivotClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(5)
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                pivotClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                wait(1)
                pivotClockwise()
                wait(1)
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(5)
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                pivotClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                pivotClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(4)
                grab()
                back()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                back()
                repeat()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(14) {
                wait(7)
                back()
                grab()
                back()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(15) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(16) {
                wait(7)
                grab()
                back()
                wait(2)
                forward()
                back()
                pivotClockwise()
                wait(1)
                forward()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                pivotClockwise()
                back()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                back()
                pivotCounterClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                back()
                wait(1)
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                back()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                back()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                back()
                wait(2)
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(8)
                grab()
                forward()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                drop()
                forward()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                rotateClockwise()
                reset()
                wait(4)
                grab()
                forward()
                pivotClockwise()
                drop()
                back()
                wait(3)
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
