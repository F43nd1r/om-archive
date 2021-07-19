
solution {
    puzzle = "w1698787731"
    name = "B CI180 2T"
    arm(ARM1) {
        number = 1
        position = -1 to 1
        rotation = -4
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -5 to 7
        rotation = -2
        size = 3
    }
    arm(ARM3) {
        number = 3
        position = -5 to 6
        rotation = -2
        size = 3
    }
    arm(ARM3) {
        number = 4
        position = -4 to 5
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 3 to 4
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 4 to 2
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 7
        position = 2 to 1
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 2 to -1
        rotation = -2
        size = 1
    }
    arm(ARM3) {
        number = 9
        position = 3 to -1
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 2 to 0
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 7 to -2
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 8 to -3
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 8 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = 8 to -1
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 15
        position = 7 to 0
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 16
        position = 7 to -1
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 17
        position = -4 to 0
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 18
        position = 1 to 0
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 19
        position = -2 to -1
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 20
        position = -1 to 2
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 21
        position = -3 to -3
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 22
        position = 1 to -3
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 23
        position = -1 to -5
        rotation = -4
        size = 3
    }
    arm(ARM1) {
        number = 24
        position = -4 to 1
        rotation = -2
        size = 3
    }
    glyph(BONDER) {
        position = -2 to 3
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 4
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 4 to -2
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to -2
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 4 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 5 to -1
        rotation = -2
    }
    glyph(PROJECTION) {
        position = 3 to 3
        rotation = -3
    }
    glyph(DISPERSION) {
        position = 1 to -2
        rotation = -4
    }
    glyph(DISPERSION) {
        position = -4 to 3
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -3
        rotation = 4
    }
    io(OUTPUT) {
        index = 1
        position = 8 to -4
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -4 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 4 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = -2 to 8
        rotation = 3
    }
    io(INPUT) {
        index = 3
        position = 4 to 3
        rotation = 0
    }
    track {
        position = -5 to 6
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = 7 to -2
        positions = listOf(0 to 0, 0 to 1, 0 to 2, 1 to 1, 1 to 0, 1 to -1)
    }
    track {
        position = -3 to -4
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 1 to -4
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(23) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                forward()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(15) {
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(11) {
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(3)
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                forward()
            }
        }
        , 
        {
            sequence(13) {
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(14) {
                wait(3)
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                forward()
            }
        }
        , 
        {
            sequence(16) {
                wait(3)
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                forward()
            }
        }
        , 
        {
            sequence(9) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(17) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(24) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(19) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(18) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(20) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(21) {
                wait(5)
                grab()
                pivotClockwise()
                back()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(22) {
                wait(9)
                grab()
                pivotClockwise()
                back()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
