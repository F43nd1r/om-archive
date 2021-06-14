
solution {
    puzzle = "P096"
    name = "B CI154 3T"
    arm(ARM2) {
        number = 1
        position = 5 to -4
        rotation = 2
        size = 3
    }
    arm(ARM2) {
        number = 2
        position = 4 to -3
        rotation = 2
        size = 3
    }
    arm(ARM2) {
        number = 3
        position = 4 to -4
        rotation = 5
        size = 3
    }
    arm(ARM2) {
        number = 4
        position = 7 to 0
        rotation = 3
        size = 3
    }
    arm(ARM2) {
        number = 5
        position = 7 to 1
        rotation = 3
        size = 3
    }
    arm(ARM2) {
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
    arm(ARM6) {
        number = 8
        position = 9 to -8
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 9
        position = 4 to -5
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 1 to -4
        rotation = -1
        size = 3
    }
    arm(ARM2) {
        number = 11
        position = -1 to 2
        rotation = 5
        size = 3
    }
    arm(ARM2) {
        number = 12
        position = -1 to 1
        rotation = 5
        size = 3
    }
    arm(ARM2) {
        number = 13
        position = 0 to 1
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 14
        position = -3 to -2
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 15
        position = -4 to -1
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 16
        position = -5 to -1
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 17
        position = -7 to 4
        rotation = 5
        size = 2
    }
    arm(ARM6) {
        number = 18
        position = -6 to 4
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 19
        position = -7 to 6
        rotation = 5
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
        position = -6 to 5
        rotation = -1
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
        position = 1 to -7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -6
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -4 to 3
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
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
        position = 4 to -5
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -6 to 6
        positions = listOf(2 to -1, 1 to -1, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
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
            }
        }
        , 
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
                wait(3)
                back()
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
                rotateClockwise()
                rotateClockwise()
                back()
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
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                wait(2)
                back()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                back()
                rotateCounterClockwise()
                wait(2)
                back()
                wait(2)
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
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
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(8) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(7)
                grab()
                forward()
                wait(2)
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                back()
            }
        }
        , 
        {
            sequence(10) {
                wait(17)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
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
                pivotClockwise()
                rotateClockwise()
                drop()
                back()
                wait(3)
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
                pivotClockwise()
                rotateClockwise()
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
                pivotClockwise()
                rotateClockwise()
                drop()
                back()
            }
        }
        , 
        {
            sequence(14) {
                wait(4)
                grab()
                back()
                back()
                rotateClockwise()
                drop()
                wait(1)
                back()
                wait(3)
                back()
            }
        }
        , 
        {
            sequence(15) {
                wait(6)
                back()
                wait(1)
                grab()
                back()
                back()
                rotateClockwise()
                drop()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(16) {
                wait(6)
                back()
                wait(3)
                back()
                wait(1)
                grab()
                back()
                back()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(17) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(18) {
                wait(7)
                grab()
                rotateCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(19) {
                wait(15)
                grab()
                back()
                back()
                back()
                drop()
            }
        }
        )
    }
}
