
solution {
    puzzle = "P070"
    name = "B CI286 4T"
    arm(ARM6) {
        number = 1
        position = 0 to -7
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 2 to -6
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -5 to -1
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -6 to -2
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -7 to -1
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 6
        position = -6 to -1
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 7
        position = -5 to -2
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 8
        position = -5 to -3
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 9
        position = -6 to -3
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -7 to -2
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 0 to -3
        rotation = 2
        size = 2
    }
    arm(ARM3) {
        number = 12
        position = 1 to -1
        rotation = 4
        size = 2
    }
    arm(ARM3) {
        number = 13
        position = 4 to -3
        rotation = 3
        size = 2
    }
    arm(ARM3) {
        number = 14
        position = 4 to -2
        rotation = 3
        size = 2
    }
    arm(ARM2) {
        number = 15
        position = 6 to -4
        rotation = 3
        size = 3
    }
    arm(ARM2) {
        number = 16
        position = 5 to -4
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 17
        position = 4 to 3
        rotation = -2
        size = 3
    }
    arm(ARM6) {
        number = 18
        position = 5 to 3
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 19
        position = 0 to -5
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 20
        position = -3 to 2
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 21
        position = 3 to -7
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 22
        position = 6 to -10
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 23
        position = 6 to -8
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 24
        position = 5 to -7
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 25
        position = 7 to -7
        rotation = 8
        size = 3
    }
    arm(ARM1) {
        number = 26
        position = 11 to -9
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 27
        position = 7 to -10
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 28
        position = 7 to -9
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 29
        position = 12 to -8
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 30
        position = 6 to 2
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 31
        position = 5 to 2
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 32
        position = 12 to -13
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 4
        rotation = -1
    }
    glyph(BONDER) {
        position = 7 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 7 to -1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -3 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 9 to -8
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -2 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to -5
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 2 to -4
        rotation = 2
    }
    glyph(DISPERSION) {
        position = -3 to -4
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 9 to -10
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 1
        rotation = 3
    }
    track {
        position = 6 to -7
        positions = listOf(0 to 0, -1 to 0, 0 to -1, 1 to -1, 1 to 0, 1 to 1)
    }
    track {
        position = 4 to -2
        positions = listOf(0 to -1, 0 to 0, -1 to 0)
    }
    track {
        position = 6 to -3
        positions = listOf(0 to -1, -1 to -1, -1 to 0)
    }
    track {
        position = -3 to 2
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = 10 to -5
        positions = listOf(0 to 0, 0 to -1, 1 to -2, 2 to -3)
    }
    track {
        position = 12 to -8
        positions = listOf(-1 to -1, -1 to -2)
    }
    track {
        position = 6 to 3
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = 12 to -10
        positions = listOf(0 to 0, 0 to -1, 0 to -2, 0 to -3)
    }
    track {
        position = 6 to -9
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = -6 to -2
        positions = listOf(-2 to 2, -1 to 2, -1 to 1, 0 to 1, 1 to 0, 1 to -1, 0 to -1, -1 to 0, -2 to 1)
    }
    tape {
        parallel(
        {
            sequence(11) {
                wait(7)
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
                wait(7)
                grab()
                rotateClockwise()
                rotateClockwise()
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
            sequence(16) {
                wait(10)
                back()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                back()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(20) {
                wait(17)
                forward()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(3)
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                wait(2)
                back()
                wait(3)
                back()
                wait(1)
                back()
                back()
                back()
                back()
            }
        }
        , 
        {
            sequence(8) {
                wait(7)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                wait(2)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
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
            sequence(29) {
                wait(10)
                grab()
                pivotCounterClockwise()
                wait(2)
                pivotClockwise()
                rotateClockwise()
                back()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(2) {
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
            sequence(21) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                wait(2)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                wait(2)
                back()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                rotateCounterClockwise()
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
            sequence(13) {
                wait(7)
                grab()
                rotateClockwise()
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
            sequence(14) {
                wait(10)
                back()
                grab()
                rotateClockwise()
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
            sequence(18) {
                wait(15)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(19) {
                wait(15)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(26) {
                wait(11)
                forward()
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(27) {
                wait(7)
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(28) {
                wait(11)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(5)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                wait(2)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                wait(2)
                back()
            }
        }
        , 
        {
            sequence(15) {
                wait(7)
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                back()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                back()
            }
        }
        , 
        {
            sequence(17) {
                wait(15)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(31) {
                wait(11)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(7)
                back()
                wait(3)
                back()
                wait(3)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                drop()
            }
        }
        , 
        {
            sequence(32) {
                wait(7)
                grab()
                back()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(25) {
                wait(11)
                back()
                wait(1)
                back()
                wait(5)
                grab()
                rotateClockwise()
                forward()
                forward()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateCounterClockwise()
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
            sequence(6) {
                wait(7)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                wait(2)
                back()
                wait(3)
                back()
                back()
                back()
                back()
            }
        }
        , 
        {
            sequence(22) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(24) {
                wait(11)
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(23) {
                wait(7)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(2)
                back()
            }
        }
        , 
        {
            sequence(30) {
                wait(11)
                grab()
                rotateCounterClockwise()
                back()
                forward()
                wait(1)
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(4)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
