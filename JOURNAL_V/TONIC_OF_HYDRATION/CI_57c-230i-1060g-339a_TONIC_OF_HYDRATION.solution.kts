
solution {
    puzzle = "P089"
    name = "B CI230 2T"
    arm(ARM1) {
        number = 1
        position = 2 to -5
        rotation = 5
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = 8 to -10
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 6 to -7
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 2 to -4
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 4 to -5
        rotation = 4
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = -2 to -8
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 7
        position = 14 to -6
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 15 to -6
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 8 to 0
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 7 to 0
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 9 to 0
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 9 to -1
        rotation = 5
        size = 2
    }
    arm(ARM6) {
        number = 13
        position = 10 to -1
        rotation = 5
        size = 2
    }
    arm(ARM6) {
        number = 14
        position = 12 to -4
        rotation = 4
        size = 2
    }
    arm(ARM3) {
        number = 15
        position = 9 to -6
        rotation = 0
        size = 3
    }
    arm(ARM3) {
        number = 16
        position = 8 to -6
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 17
        position = 12 to -8
        rotation = 1
        size = 2
    }
    arm(ARM2) {
        number = 18
        position = 9 to -9
        rotation = 0
        size = 3
    }
    arm(ARM3) {
        number = 19
        position = 2 to -6
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 20
        position = -1 to -8
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 21
        position = 3 to 2
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 22
        position = 6 to -5
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = 4 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = -1
    }
    glyph(BONDER) {
        position = 5 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = 11 to -6
        rotation = -1
    }
    glyph(BONDER) {
        position = 14 to -9
        rotation = 1
    }
    glyph(BONDER) {
        position = 4 to -6
        rotation = -1
    }
    glyph(BONDER) {
        position = 3 to -7
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -7
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to -5
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to -4
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to -6
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to -9
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 8 to -3
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 10 to -4
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 3 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 13 to -8
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 5 to -9
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 3 to -10
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 1 to -9
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 2 to -9
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -5 to -5
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = 12 to -15
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 12 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 11 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 4 to -7
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 12 to -3
        rotation = 0
    }
    track {
        position = 3 to 2
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 7 to 0
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = 15 to -6
        positions = listOf(0 to 0, 1 to -1, 2 to -2)
    }
    track {
        position = 8 to -5
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = 12 to -9
        positions = listOf(-1 to 0, 0 to 0, 0 to 1)
    }
    track {
        position = 5 to -6
        positions = listOf(3 to -4, 2 to -4, 1 to -3, 2 to -3, 1 to -2, 1 to -1, 0 to 0, -1 to 1, -2 to 1, -2 to 0, -3 to 0, -4 to 1, -3 to 1, -3 to 2)
    }
    track {
        position = -1 to -7
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(8)
                grab()
                back()
                reset()
                wait(3)
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(2)
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                forward()
                wait(1)
                forward()
                repeat()
            }
        }
        , 
        {
            sequence(22) {
                wait(12)
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                back()
                grab()
                extend()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                retract()
                wait(4)
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
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
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                forward()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                forward()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(9)
                forward()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                wait(1)
                forward()
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                back()
                back()
                drop()
                wait(5)
                back()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(6) {
                wait(8)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                forward()
                wait(1)
                rotateCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
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
            sequence(16) {
                wait(5)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(14) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
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
            sequence(15) {
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(11) {
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
            sequence(12) {
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
            sequence(17) {
                grab()
                back()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(18) {
                wait(6)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(19) {
                wait(10)
                grab()
                rotateClockwise()
                back()
                pivotClockwise()
                rotateClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(20) {
                wait(15)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(21) {
                wait(8)
                grab()
                forward()
                pivotCounterClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                back()
            }
        }
        )
    }
}
