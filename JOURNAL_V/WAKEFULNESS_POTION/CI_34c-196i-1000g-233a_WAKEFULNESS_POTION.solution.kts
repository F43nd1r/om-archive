
solution {
    puzzle = "P088"
    name = "B CI196 2T"
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
        position = -1 to 7
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 12
        position = -2 to 7
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 13
        position = 0 to 6
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = 1 to 5
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 15
        position = 3 to 6
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 16
        position = 9 to -7
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 17
        position = 2 to -6
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 18
        position = -3 to -1
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 19
        position = -3 to 6
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 20
        position = -4 to 7
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 21
        position = -5 to 0
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 22
        position = -7 to 6
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 23
        position = -5 to 8
        rotation = -1
        size = 3
    }
    arm(PISTON) {
        number = 24
        position = -1 to 5
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 25
        position = 0 to 5
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 26
        position = -2 to 8
        rotation = -2
        size = 2
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
    glyph(DUPLICATION) {
        position = -2 to 1
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = -1 to -4
        rotation = 12
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
        positions = listOf(-2 to 0, -2 to 1, -1 to 1, -2 to 2)
    }
    track {
        position = 8 to -6
        positions = listOf(-1 to 1, 0 to 0, 1 to -1)
    }
    track {
        position = -4 to 0
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -1 to 8
        positions = listOf(-2 to -1, -3 to 0, -3 to 1, -2 to 1, -1 to 0)
    }
    track {
        position = -2 to 7
        positions = listOf(0 to 0, 1 to -1, 1 to 0)
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
            }
        }
        , 
        {
            sequence(13) {
                wait(2)
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
            }
        }
        , 
        {
            sequence(14) {
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
            }
        }
        , 
        {
            sequence(15) {
                wait(5)
                grab()
                forward()
                forward()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(18) {
                wait(21)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
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
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(16) {
                grab()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(17) {
                wait(17)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(21) {
                wait(18)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(23) {
                wait(15)
                back()
                grab()
                rotateClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(20) {
                wait(4)
                grab()
                rotateClockwise()
                back()
                back()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(25) {
                wait(10)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(24) {
                wait(29)
                grab()
                extend()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(19) {
                wait(22)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(11) {
                wait(10)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(22) {
                wait(26)
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(12) {
                wait(10)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(26) {
                wait(20)
                grab()
                back()
                back()
                back()
                back()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
