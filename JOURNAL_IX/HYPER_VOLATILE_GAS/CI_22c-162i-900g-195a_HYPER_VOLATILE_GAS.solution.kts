
solution {
    puzzle = "P106"
    name = "B CI162 6T"
    arm(ARM1) {
        number = 1
        position = 3 to -7
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 3 to -8
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 2 to -7
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -2 to -8
        rotation = 7
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 1 to -7
        rotation = 9
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -4 to -5
        rotation = 11
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 2 to -6
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 1 to -5
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 1 to -6
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 3 to -9
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 7 to -3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 8 to -3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 7 to -2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = 8 to 2
        rotation = 9
        size = 1
    }
    arm(ARM1) {
        number = 15
        position = 7 to -1
        rotation = 13
        size = 3
    }
    arm(ARM1) {
        number = 16
        position = 5 to 4
        rotation = 11
        size = 2
    }
    arm(ARM1) {
        number = 17
        position = 6 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 18
        position = 5 to -1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 19
        position = 6 to -1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 20
        position = 9 to -3
        rotation = 6
        size = 3
    }
    glyph(BONDER) {
        position = 6 to -9
        rotation = -1
    }
    glyph(BONDER) {
        position = 2 to -11
        rotation = -1
    }
    glyph(BONDER) {
        position = 11 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = 9 to -6
        rotation = -1
    }
    glyph(BONDER) {
        position = 7 to -11
        rotation = 0
    }
    glyph(BONDER) {
        position = 8 to -8
        rotation = -1
    }
    glyph(BONDER) {
        position = 11 to -8
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to -8
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 3 to -10
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = 5 to -10
        rotation = -1
    }
    glyph(TRIPLEX_BONDER) {
        position = 8 to -10
        rotation = 7
    }
    glyph(TRIPLEX_BONDER) {
        position = 9 to -7
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = 10 to -6
        rotation = 6
    }
    glyph(TRIPLEX_BONDER) {
        position = 11 to -3
        rotation = 2
    }
    glyph(TRIPLEX_BONDER) {
        position = 7 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to -3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 0 to -4
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -1 to -6
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to -7
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 4 to -12
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 2 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 4 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 6 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 6 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 11 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 6 to -6
        rotation = -1
    }
    track {
        position = 2 to -7
        positions = listOf(2 to -2, 3 to -2, 3 to -1, 2 to 0, 2 to -1, 1 to 0, 1 to -1, 0 to 0, 0 to 1, -1 to 2, -1 to 1, -1 to 0, 0 to -1)
    }
    track {
        position = -4 to -5
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = 6 to -2
        positions = listOf(3 to -2, 3 to -3, 2 to -3, 1 to -2, 2 to -2, 1 to -1, 2 to -1, 1 to 0, 0 to 0, -1 to 1, 0 to 1, 1 to 1, 2 to 0)
    }
    track {
        position = 5 to 4
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(7) {
                wait(3)
                grab()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                back()
                drop()
                wait(2)
                back()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                grab()
                pivotCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(20) {
                wait(7)
                grab()
                pivotClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateClockwise()
                back()
                rotateClockwise()
                wait(1)
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(17) {
                wait(5)
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                back()
                drop()
                wait(2)
                back()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                back()
                grab()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                back()
                drop()
            }
        }
        , 
        {
            sequence(18) {
                wait(8)
                back()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                back()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                wait(1)
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                wait(1)
                back()
                wait(6)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                wait(1)
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                back()
                wait(3)
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                wait(1)
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(12) {
                wait(5)
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateClockwise()
                back()
                rotateClockwise()
                wait(1)
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
            }
        }
        , 
        {
            sequence(13) {
                wait(5)
                back()
                wait(3)
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateClockwise()
                back()
                rotateClockwise()
                wait(1)
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(14) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(7)
                grab()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(11)
                grab()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(9)
                back()
                back()
                grab()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(19) {
                wait(11)
                back()
                back()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(15) {
                wait(9)
                grab()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(16) {
                wait(13)
                grab()
                forward()
                drop()
            }
        }
        )
    }
}
