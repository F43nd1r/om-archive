
solution {
    puzzle = "P104"
    name = "B CGX 6T"
    arm(ARM1) {
        number = 1
        position = 5 to -1
        rotation = 7
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 7 to 4
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 2 to 5
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 6 to 4
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 7 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 6 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -2 to 3
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -1 to 5
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -4 to 2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -3 to 1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = -2 to 1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 12
        position = 2 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 2 to -4
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = 7 to -4
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 15
        position = 10 to 4
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 16
        position = 9 to 4
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 17
        position = 15 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 18
        position = 14 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 19
        position = 14 to -3
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 20
        position = 8 to -2
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 21
        position = 8 to 2
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 11 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = 9 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 10 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 11 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 14 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 9 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 10 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to -3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 9 to 1
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 12 to 1
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = 4 to 0
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 1 to 0
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 2 to 0
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 10 to -6
        rotation = 3
    }
    glyph(ANIMISMUS) {
        position = 11 to -1
        rotation = -1
    }
    glyph(ANIMISMUS) {
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 6 to 1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 6 to -6
        rotation = 1
    }
    track {
        position = 2 to -3
        positions = listOf(-2 to 0, -1 to 0, 0 to 0, 0 to 1)
    }
    track {
        position = 14 to -4
        positions = listOf(0 to 1, 1 to 0, 1 to -1, 0 to 0)
    }
    track {
        position = 7 to -1
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = 2 to -5
        positions = listOf(0 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = 9 to 5
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = -3 to 1
        positions = listOf(0 to 1, 1 to 0, 0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(10)
                extendTape()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(3)
                repeat()
                wait(4)
                back()
                wait(1)
                grab()
                forward()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(15) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                reset()
                wait(8)
                grab()
                rotateCounterClockwise()
                back()
                reset()
                wait(8)
                grab()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(8)
                grab()
                rotateClockwise()
                reset()
                wait(9)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(8)
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                pivotClockwise()
                reset()
                wait(6)
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(4)
                reset()
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(10)
                grab()
                rotateCounterClockwise()
                reset()
                wait(9)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(16) {
                wait(12)
                grab()
                rotateCounterClockwise()
                reset()
                wait(9)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(12)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(8)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(10)
                grab()
                back()
                back()
                back()
                rotateClockwise()
                reset()
                wait(6)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(14) {
                wait(15)
                grab()
                rotateCounterClockwise()
                reset()
                wait(9)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(14)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(7)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(21) {
                wait(14)
                grab()
                rotateClockwise()
                reset()
                wait(9)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(18) {
                wait(6)
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(19) {
                wait(9)
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                pivotClockwise()
                forward()
                pivotClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                back()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                wait(4)
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(20) {
                wait(13)
                grab()
                back()
                reset()
                wait(9)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                rotateClockwise()
                rotateCounterClockwise()
                wait(15)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(7)
                grab()
                back()
                drop()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                reset()
                wait(3)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(11)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                reset()
                wait(6)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                wait(3)
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(17) {
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(8)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
