
solution {
    puzzle = "P088"
    name = "B CX 6T"
    arm(ARM1) {
        number = 1
        position = 13 to -4
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 6 to -4
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 7 to -4
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 10 to -5
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 10 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 11 to 1
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 2 to 7
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 7 to 4
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 8 to 3
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -1 to 6
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = 0 to 6
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 1 to 5
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 3 to 6
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = 2 to -2
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 15
        position = -1 to 5
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 16
        position = -3 to 6
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 17
        position = -5 to 6
        rotation = -1
        size = 3
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 5 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -5 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = -5 to 2
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 8 to 1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 6 to 0
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 6 to -2
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = -3 to 4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 10 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 9 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 5 to 3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to 3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 5
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -6 to 4
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 2 to 4
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 4 to 2
        rotation = 9
    }
    glyph(DUPLICATION) {
        position = -3 to 2
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = 10 to -4
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -1 to 4
        rotation = -1
    }
    track {
        position = 13 to -4
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = 10 to -5
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 0 to 6
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 1 to -1)
    }
    track {
        position = 2 to 6
        positions = listOf(1 to 0, 1 to -1, 1 to -2)
    }
    track {
        position = -3 to 6
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = 2 to -2
        positions = listOf(-3 to 1, -2 to 0, -1 to 0, 0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                reset()
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(5)
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
                wait(5)
                grab()
                rotateCounterClockwise()
                forward()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
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
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                wait(2)
                rotateClockwise()
                reset()
                wait(3)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                wait(1)
                rotateClockwise()
                reset()
                wait(4)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                wait(1)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(6)
                forward()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                wait(1)
                rotateClockwise()
                drop()
                wait(2)
                repeat()
                wait(10)
                forward()
                forward()
                wait(3)
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(5)
                grab()
                forward()
                forward()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(15) {
                wait(10)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(9)
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                back()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                wait(2)
                forward()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                back()
                drop()
                forward()
                forward()
                forward()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(16) {
                wait(4)
                grab()
                forward()
                reset()
                wait(2)
                forward()
                wait(5)
                back()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(17) {
                wait(7)
                back()
                grab()
                forward()
                wait(2)
                rotateClockwise()
                pivotClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                wait(2)
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
