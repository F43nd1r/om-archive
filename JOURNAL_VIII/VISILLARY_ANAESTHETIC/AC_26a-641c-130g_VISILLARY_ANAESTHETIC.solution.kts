
solution {
    puzzle = "P102"
    name = "B X ACX"
    arm(PISTON) {
        number = 1
        position = 1 to 0
        rotation = 5
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = 2 to 2
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 3 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 0 to 2
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 4 to -2
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -1
        rotation = -1
    }
    io(OUTPUT) {
        index = 1
        position = 5 to -1
        rotation = -2
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                pivotCounterClockwise()
                wait(1)
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                wait(2)
                retract()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                retract()
                rotateCounterClockwise()
                extend()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                extend()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                retract()
                pivotCounterClockwise()
                wait(1)
                extend()
                extend()
                retract()
                rotateClockwise()
                drop()
                extend()
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                wait(2)
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                wait(4)
                grab()
                retract()
                rotateClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                extend()
                wait(2)
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                rotateClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                extend()
                retract()
                rotateCounterClockwise()
                wait(1)
                extend()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                retract()
                grab()
                extend()
                drop()
                extend()
                grab()
                retract()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                wait(3)
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
