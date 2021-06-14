
solution {
    puzzle = "P098"
    name = "B CI518 6T"
    arm(ARM1) {
        number = 1
        position = -4 to 0
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -5 to 1
        rotation = -2
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = -4 to -6
        rotation = 1
        size = 3
    }
    arm(ARM3) {
        number = 4
        position = -6 to -7
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -7 to -6
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = -5 to -6
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 7
        position = -1 to -6
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 8
        position = 0 to -6
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 9
        position = 0 to -5
        rotation = 2
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 10
        position = -2 to 1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 11
        position = -1 to 3
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 12
        position = 0 to 4
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = -1 to 5
        rotation = -2
        size = 3
    }
    arm(ARM6) {
        number = 14
        position = -3 to 0
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 15
        position = 0 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 16
        position = 0 to -4
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -11 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = -6 to -2
        rotation = -3
    }
    glyph(BONDER) {
        position = -5 to -2
        rotation = -4
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -9 to -3
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -9 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -12 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -7 to -4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -2 to 0
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 0 to 2
        rotation = -3
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 10
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -11 to -6
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = -2 to 3
        rotation = 0
    }
    track {
        position = -7 to -6
        positions = listOf(0 to 0, -1 to 1)
    }
    track {
        position = -5 to -6
        positions = listOf(2 to -1, 1 to 0, 0 to 0, -1 to 1)
    }
    track {
        position = 0 to 5
        positions = listOf(0 to -1, 0 to -2, -1 to -1, -1 to 0)
    }
    track {
        position = -4 to 0
        positions = listOf(0 to 0, 0 to 1, -1 to 1)
    }
    track {
        position = -1 to -6
        positions = listOf(0 to 0, 0 to 1, 1 to 1, 1 to 0)
    }
    track {
        position = -2 to -3
        positions = listOf(2 to 0, 3 to 0, 4 to 0, 5 to 0, 6 to 0, 7 to 0)
    }
    track {
        position = 3 to -4
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -3 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                forward()
                wait(1)
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                wait(3)
                grab()
                back()
                rotateClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                wait(2)
                rotateCounterClockwise()
                wait(4)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(3)
                pivotCounterClockwise()
                drop()
                back()
                wait(8)
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                back()
                wait(2)
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(10)
                grab()
                rotateCounterClockwise()
                wait(1)
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                repeat()
                wait(5)
                repeat()
                wait(5)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(13) {
                wait(16)
                forward()
                grab()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(30)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                wait(11)
                repeat()
                wait(5)
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
                grab()
                rotateCounterClockwise()
                drop()
                repeat()
                wait(2)
                repeat()
                wait(3)
                repeat()
                wait(2)
                repeat()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(2)
                repeat()
                wait(3)
                repeat()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                forward()
                wait(6)
                grab()
                back()
                rotateClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                wait(3)
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                wait(3)
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                wait(1)
                drop()
                back()
                rotateCounterClockwise()
                back()
                wait(2)
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                back()
                wait(2)
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(24)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(5)
                grab()
                rotateCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                drop()
                wait(2)
                grab()
                rotateCounterClockwise()
                wait(5)
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(28)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                wait(11)
                repeat()
                wait(5)
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
                wait(30)
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                wait(11)
                repeat()
                wait(5)
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
                wait(31)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(12)
                repeat()
                wait(5)
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
            sequence(7) {
                grab()
                forward()
                rotateClockwise()
                forward()
                drop()
                forward()
                wait(1)
                forward()
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                forward()
                rotateClockwise()
                wait(4)
                forward()
                drop()
                forward()
                wait(1)
                forward()
                grab()
                forward()
                rotateClockwise()
                forward()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(9) {
                wait(3)
                forward()
                wait(1)
                forward()
                grab()
                forward()
                rotateClockwise()
                forward()
                drop()
                forward()
                wait(1)
                forward()
                grab()
                forward()
                rotateClockwise()
                forward()
                drop()
                forward()
                wait(1)
                forward()
                grab()
                forward()
                rotateClockwise()
                forward()
                drop()
                wait(4)
                forward()
                rotateCounterClockwise()
                forward()
                grab()
                forward()
                rotateClockwise()
                forward()
                drop()
                forward()
                wait(1)
                forward()
                grab()
                forward()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(3)
                forward()
                grab()
                forward()
                rotateClockwise()
                forward()
                drop()
                forward()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(11)
                forward()
                grab()
                forward()
                rotateClockwise()
                forward()
                drop()
                forward()
                wait(1)
                forward()
                grab()
                forward()
                rotateClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(15) {
                wait(12)
                grab()
                forward()
                drop()
                wait(5)
                grab()
                forward()
                drop()
                wait(9)
                grab()
                forward()
                drop()
                wait(11)
                grab()
                forward()
                wait(1)
                forward()
                drop()
            }
        }
        , 
        {
            sequence(16) {
                wait(50)
                grab()
                back()
                wait(4)
                back()
                wait(1)
                back()
                drop()
            }
        }
        )
    }
}
