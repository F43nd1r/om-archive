
solution {
    puzzle = "w1698789743"
    name = "B X S F BIGGIEMAC42"
    arm(ARM6) {
        number = 1
        position = 4 to -1
        rotation = -1
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = 2 to 1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 1 to 4
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 1 to 0
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to 1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 6 to -1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 3 to -1
        rotation = -5
    }
    glyph(ANIMISMUS) {
        position = 2 to 2
        rotation = -4
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 5 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 2
    }
    io(OUTPUT) {
        index = 1
        position = 3 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                retract()
                drop()
                extend()
                wait(6)
                grab()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                retract()
                grab()
                extend()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(10)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
