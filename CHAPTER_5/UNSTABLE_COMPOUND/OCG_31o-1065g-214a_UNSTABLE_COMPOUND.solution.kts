
solution {
    puzzle = "P040"
    name = "OVERLAP G"
    arm(ARM1) {
        number = 1
        position = 5 to -5
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 6 to -6
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 1 to -4
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 1 to 2
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 0 to 2
        rotation = -1
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = 1 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 4 to 2
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 6 to 12
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 8 to -4
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 6 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = 6 to -5
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 12
        position = 0 to 3
        rotation = -7
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 6 to -1
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = 5 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 5 to -1
        rotation = 5
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 5 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 5 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = 5 to -1
        rotation = 3
    }
    glyph(BONDER) {
        position = 6 to -1
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 5 to -1
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 5 to -1
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 5 to -1
        rotation = 4
    }
    glyph(TRIPLEX_BONDER) {
        position = 5 to -1
        rotation = 5
    }
    glyph(TRIPLEX_BONDER) {
        position = 6 to -2
        rotation = 2
    }
    glyph(TRIPLEX_BONDER) {
        position = 5 to 0
        rotation = 4
    }
    glyph(TRIPLEX_BONDER) {
        position = 4 to 1
        rotation = 2
    }
    glyph(TRIPLEX_BONDER) {
        position = 5 to -1
        rotation = 2
    }
    glyph(TRIPLEX_BONDER) {
        position = 5 to -1
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = 4 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 5 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 5 to -1
        rotation = 5
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 5 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 6 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 7 to -5
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 5 to -1
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 7 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 6 to -4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 5 to -3
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 5 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 8 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 5 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -1
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = 4 to 0
        rotation = 0
    }
    track {
        position = 4 to -4
        positions = listOf(-3 to 0, -2 to 0, -1 to 0, 0 to 0, 1 to 0, 0 to 1, -1 to 1)
    }
    track {
        position = 4 to 2
        positions = listOf(0 to 0, -1 to 1, -2 to 2, -3 to 3, -4 to 4, -5 to 5, -6 to 6, -7 to 7, -8 to 8, -9 to 9, -10 to 10, -11 to 11)
    }
    track {
        position = -4 to 2
        positions = listOf(5 to -1, 4 to 0, 5 to 0, 6 to 0, 5 to 1, 4 to 1, 4 to 2, 5 to 2)
    }
    track {
        position = 3 to -4
        positions = listOf(1 to 0, 1 to -1, 2 to -2, 2 to -3, 2 to -4, 2 to -5, 2 to -6)
    }
    track {
        position = 9 to -3
        positions = listOf(0 to 0, 1 to -1, 2 to -2)
    }
    track {
        position = 5 to -5
        positions = listOf(1 to 1, 1 to 0, 1 to -1, 0 to 0, 0 to -1)
    }
    track {
        position = 5 to 11
        positions = listOf(1 to 2, 1 to 1, 1 to 0, 1 to -1, 1 to -2, 1 to -3, 1 to -4, 1 to -5, 1 to -6, 1 to -7, 1 to -8, 1 to -9, 1 to -10, 1 to -11, 1 to -12, 2 to -13, 2 to -14, 3 to -15, 3 to -14, 4 to -15, 5 to -15)
    }
    tape {
        parallel(
        {
            sequence(12) {
                wait(12)
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                back()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                pivotClockwise()
                forward()
                forward()
                forward()
                forward()
                pivotCounterClockwise()
                back()
                back()
                drop()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                wait(4)
                grab()
                forward()
                rotateClockwise()
                pivotClockwise()
                drop()
                forward()
                wait(5)
                extendTape()
            }
        }
        , 
        {
            sequence(13) {
                wait(18)
                forward()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                forward()
                pivotClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(19)
                forward()
                rotateClockwise()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(6) {
                wait(18)
                grab()
                extend()
                drop()
                rotateClockwise()
                forward()
                forward()
                rotateClockwise()
                extend()
                grab()
                forward()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                back()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                back()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(18)
                grab()
                forward()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                forward()
                wait(3)
                forward()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                forward()
                forward()
                forward()
                forward()
                wait(1)
                back()
                back()
                wait(2)
                back()
                back()
                forward()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                forward()
                wait(3)
                forward()
            }
        }
        , 
        {
            sequence(11) {
                wait(3)
                forward()
                wait(7)
                forward()
                wait(1)
                back()
                wait(4)
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(10) {
                wait(3)
                forward()
                wait(7)
                forward()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                forward()
                rotateCounterClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(10)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                wait(5)
                forward()
                wait(2)
                grab()
                forward()
                rotateClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(14)
                grab()
                back()
                pivotCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                drop()
            }
        }
        )
    }
}
