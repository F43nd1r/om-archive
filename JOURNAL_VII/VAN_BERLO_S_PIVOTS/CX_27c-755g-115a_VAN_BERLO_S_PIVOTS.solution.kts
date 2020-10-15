
solution {
    puzzle = "P096"
    name = "B CA 6T"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 0 to -1
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 0 to -2
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 3 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 1 to 3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 2 to 3
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 5 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 4 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 1 to -1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 0 to -3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = -1 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 12
        position = -2 to -2
        rotation = 6
        size = 1
    }
    arm(PISTON) {
        number = 13
        position = -7 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = -5 to 4
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 15
        position = -5 to 3
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 16
        position = -4 to 3
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 17
        position = -7 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 18
        position = -8 to 1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 19
        position = -11 to 6
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 20
        position = -9 to 7
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -5 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -7 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -9 to 6
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 4 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -7 to 3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -9 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -7 to 4
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = -2
    }
    io(OUTPUT) {
        index = 1
        position = 6 to 0
        rotation = -3
    }
    io(OUTPUT) {
        index = 2
        position = -7 to 6
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = -6 to -1
        rotation = 1
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = 3 to 3
        positions = listOf(-1 to -1, -2 to 0, -1 to 0, 0 to -1)
    }
    track {
        position = -5 to 4
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = -9 to 1
        positions = listOf(0 to 0, 1 to -1, 2 to -1, 1 to 0)
    }
    track {
        position = -8 to 7
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 5 to -4
        positions = listOf(0 to 0, 0 to -1, -1 to -1, -1 to 0)
    }
    track {
        position = -7 to 1
        positions = listOf(5 to -4, 6 to -4, 7 to -4, 6 to -3, 6 to -2, 5 to -2, 5 to -3)
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
                back()
                wait(1)
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
            sequence(6) {
                wait(3)
                back()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                back()
                back()
                wait(1)
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
            sequence(15) {
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
            sequence(16) {
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
                pivotCounterClockwise()
                wait(1)
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(17) {
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
                wait(7)
                grab()
                back()
                back()
                wait(2)
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(18) {
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
                wait(12)
                repeat()
            }
        }
        , 
        {
            sequence(20) {
                wait(9)
                grab()
                back()
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
            sequence(5) {
                wait(3)
                back()
                back()
                wait(1)
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
            sequence(7) {
                wait(3)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                forward()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                forward()
                rotateClockwise()
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                forward()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                forward()
                wait(2)
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                forward()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(19) {
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
                retract()
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
                retract()
                grab()
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(21)
                grab()
                retract()
                retract()
                pivotClockwise()
                reset()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                rotateClockwise()
                reset()
                wait(5)
                repeat()
                wait(3)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(10)
                grab()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                wait(2)
                pivotClockwise()
                drop()
                wait(3)
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(4)
                grab()
                rotateClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(13)
                back()
                back()
                back()
                forward()
                forward()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                back()
                back()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(13)
                forward()
                back()
                back()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                wait(1)
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(14) {
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
        )
    }
}
