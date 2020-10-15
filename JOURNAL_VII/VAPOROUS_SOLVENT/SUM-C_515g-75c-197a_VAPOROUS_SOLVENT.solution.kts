
solution {
    puzzle = "P098"
    name = "B CG 6T"
    arm(ARM6) {
        number = 1
        position = 1 to 6
        rotation = 6
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = 4 to -3
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 6 to 2
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 3 to 6
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 0 to 1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -1 to 1
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -2 to 1
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -1 to -5
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -4 to -5
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = -3 to -6
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = -2 to -5
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 2 to -5
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 0 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 14
        position = 2 to -4
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 15
        position = 5 to -2
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 16
        position = 4 to -1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -8 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = -6 to -2
        rotation = -2
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = -3
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = -4
    }
    glyph(BONDER) {
        position = 3 to 2
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -6 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -9 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to -3
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 3 to -2
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = 2 to 6
        rotation = -2
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -8 to -5
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = 1 to 7
        rotation = 0
    }
    track {
        position = -2 to -5
        positions = listOf(2 to -1, 1 to 0, 0 to 0, -1 to 1)
    }
    track {
        position = 0 to 1
        positions = listOf(-2 to 0, -1 to 0, -2 to 1)
    }
    track {
        position = -5 to -4
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = 2 to -3
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(10) {
                wait(7)
                grab()
                rotateCounterClockwise()
                wait(16)
                rotateCounterClockwise()
                reset()
                wait(8)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(14)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(16)
                grab()
                forward()
                wait(1)
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                wait(8)
                forward()
                wait(4)
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                wait(7)
                forward()
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(21)
                forward()
                wait(6)
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                wait(13)
                forward()
                wait(3)
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                wait(2)
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                reset()
                repeat()
                wait(35)
                repeat()
                wait(9)
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
                wait(14)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
                wait(8)
                grab()
                rotateCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                rotateCounterClockwise()
                wait(10)
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                rotateCounterClockwise()
                back()
                reset()
                wait(24)
                repeat()
                wait(17)
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
                wait(22)
                grab()
                forward()
                rotateCounterClockwise()
                reset()
                wait(8)
                repeat()
                wait(17)
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
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
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
            sequence(15) {
                wait(3)
                grab()
                rotateClockwise()
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
            sequence(16) {
                wait(7)
                grab()
                rotateClockwise()
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
            sequence(2) {
                wait(1)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(3)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(2)
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
            sequence(14) {
                wait(4)
                grab()
                rotateClockwise()
                back()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
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
                wait(12)
                grab()
                rotateClockwise()
                reset()
                wait(6)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(14)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(1)
                repeat()
                wait(9)
                repeat()
                wait(7)
                repeat()
                wait(9)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                repeat()
                wait(2)
                repeat()
                wait(2)
                repeat()
                wait(2)
                repeat()
                wait(3)
                repeat()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(2)
                repeat()
                wait(2)
                repeat()
                wait(7)
                repeat()
                wait(25)
                extendTape()
            }
        }
        )
    }
}
